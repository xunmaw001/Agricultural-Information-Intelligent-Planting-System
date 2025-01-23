
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 农业科技收藏
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/nongyekejiCollection")
public class NongyekejiCollectionController {
    private static final Logger logger = LoggerFactory.getLogger(NongyekejiCollectionController.class);

    private static final String TABLE_NAME = "nongyekejiCollection";

    @Autowired
    private NongyekejiCollectionService nongyekejiCollectionService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private ChuqinyangzhiService chuqinyangzhiService;//畜禽养殖
    @Autowired
    private ChuqinyangzhiCollectionService chuqinyangzhiCollectionService;//畜禽养殖收藏
    @Autowired
    private ChuqinyangzhiLiuyanService chuqinyangzhiLiuyanService;//畜禽养殖留言
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private ForumService forumService;//论坛
    @Autowired
    private GonggaoService gonggaoService;//公告
    @Autowired
    private GuaguoshucaiService guaguoshucaiService;//瓜果蔬菜
    @Autowired
    private GuaguoshucaiCollectionService guaguoshucaiCollectionService;//瓜果蔬菜收藏
    @Autowired
    private GuaguoshucaiLiuyanService guaguoshucaiLiuyanService;//瓜果蔬菜留言
    @Autowired
    private LiuyanService liuyanService;//留言板
    @Autowired
    private NongyekejiService nongyekejiService;//农业科技
    @Autowired
    private NongyekejiLiuyanService nongyekejiLiuyanService;//农业科技留言
    @Autowired
    private ShuichanyangzhiService shuichanyangzhiService;//水产养殖
    @Autowired
    private ShuichanyangzhiCollectionService shuichanyangzhiCollectionService;//水产养殖收藏
    @Autowired
    private ShuichanyangzhiLiuyanService shuichanyangzhiLiuyanService;//水产养殖留言
    @Autowired
    private TurangfeiliaoService turangfeiliaoService;//土壤肥料
    @Autowired
    private TurangfeiliaoCollectionService turangfeiliaoCollectionService;//土壤肥料收藏
    @Autowired
    private TurangfeiliaoLiuyanService turangfeiliaoLiuyanService;//土壤肥料留言
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = nongyekejiCollectionService.queryPage(params);

        //字典表数据转换
        List<NongyekejiCollectionView> list =(List<NongyekejiCollectionView>)page.getList();
        for(NongyekejiCollectionView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        NongyekejiCollectionEntity nongyekejiCollection = nongyekejiCollectionService.selectById(id);
        if(nongyekejiCollection !=null){
            //entity转view
            NongyekejiCollectionView view = new NongyekejiCollectionView();
            BeanUtils.copyProperties( nongyekejiCollection , view );//把实体数据重构到view中
            //级联表 农业科技
            //级联表
            NongyekejiEntity nongyekeji = nongyekejiService.selectById(nongyekejiCollection.getNongyekejiId());
            if(nongyekeji != null){
            BeanUtils.copyProperties( nongyekeji , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setNongyekejiId(nongyekeji.getId());
            }
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(nongyekejiCollection.getYonghuId());
            if(yonghu != null){
            BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setYonghuId(yonghu.getId());
            }
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody NongyekejiCollectionEntity nongyekejiCollection, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,nongyekejiCollection:{}",this.getClass().getName(),nongyekejiCollection.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            nongyekejiCollection.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<NongyekejiCollectionEntity> queryWrapper = new EntityWrapper<NongyekejiCollectionEntity>()
            .eq("nongyekeji_id", nongyekejiCollection.getNongyekejiId())
            .eq("yonghu_id", nongyekejiCollection.getYonghuId())
            .eq("nongyekeji_collection_types", nongyekejiCollection.getNongyekejiCollectionTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        NongyekejiCollectionEntity nongyekejiCollectionEntity = nongyekejiCollectionService.selectOne(queryWrapper);
        if(nongyekejiCollectionEntity==null){
            nongyekejiCollection.setInsertTime(new Date());
            nongyekejiCollection.setCreateTime(new Date());
            nongyekejiCollectionService.insert(nongyekejiCollection);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody NongyekejiCollectionEntity nongyekejiCollection, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,nongyekejiCollection:{}",this.getClass().getName(),nongyekejiCollection.toString());
        NongyekejiCollectionEntity oldNongyekejiCollectionEntity = nongyekejiCollectionService.selectById(nongyekejiCollection.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            nongyekejiCollection.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

            nongyekejiCollectionService.updateById(nongyekejiCollection);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<NongyekejiCollectionEntity> oldNongyekejiCollectionList =nongyekejiCollectionService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        nongyekejiCollectionService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<NongyekejiCollectionEntity> nongyekejiCollectionList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("../../upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            NongyekejiCollectionEntity nongyekejiCollectionEntity = new NongyekejiCollectionEntity();
//                            nongyekejiCollectionEntity.setNongyekejiId(Integer.valueOf(data.get(0)));   //农业科技 要改的
//                            nongyekejiCollectionEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            nongyekejiCollectionEntity.setNongyekejiCollectionTypes(Integer.valueOf(data.get(0)));   //类型 要改的
//                            nongyekejiCollectionEntity.setInsertTime(date);//时间
//                            nongyekejiCollectionEntity.setCreateTime(date);//时间
                            nongyekejiCollectionList.add(nongyekejiCollectionEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        nongyekejiCollectionService.insertBatch(nongyekejiCollectionList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }




    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = nongyekejiCollectionService.queryPage(params);

        //字典表数据转换
        List<NongyekejiCollectionView> list =(List<NongyekejiCollectionView>)page.getList();
        for(NongyekejiCollectionView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        NongyekejiCollectionEntity nongyekejiCollection = nongyekejiCollectionService.selectById(id);
            if(nongyekejiCollection !=null){


                //entity转view
                NongyekejiCollectionView view = new NongyekejiCollectionView();
                BeanUtils.copyProperties( nongyekejiCollection , view );//把实体数据重构到view中

                //级联表
                    NongyekejiEntity nongyekeji = nongyekejiService.selectById(nongyekejiCollection.getNongyekejiId());
                if(nongyekeji != null){
                    BeanUtils.copyProperties( nongyekeji , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setNongyekejiId(nongyekeji.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(nongyekejiCollection.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody NongyekejiCollectionEntity nongyekejiCollection, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,nongyekejiCollection:{}",this.getClass().getName(),nongyekejiCollection.toString());
        Wrapper<NongyekejiCollectionEntity> queryWrapper = new EntityWrapper<NongyekejiCollectionEntity>()
            .eq("nongyekeji_id", nongyekejiCollection.getNongyekejiId())
            .eq("yonghu_id", nongyekejiCollection.getYonghuId())
            .eq("nongyekeji_collection_types", nongyekejiCollection.getNongyekejiCollectionTypes())
//            .notIn("nongyekeji_collection_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        NongyekejiCollectionEntity nongyekejiCollectionEntity = nongyekejiCollectionService.selectOne(queryWrapper);
        if(nongyekejiCollectionEntity==null){
            nongyekejiCollection.setInsertTime(new Date());
            nongyekejiCollection.setCreateTime(new Date());
        nongyekejiCollectionService.insert(nongyekejiCollection);

            return R.ok();
        }else {
            return R.error(511,"您已经收藏过了");
        }
    }

}

