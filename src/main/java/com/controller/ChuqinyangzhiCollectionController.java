
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
 * 畜禽养殖收藏
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/chuqinyangzhiCollection")
public class ChuqinyangzhiCollectionController {
    private static final Logger logger = LoggerFactory.getLogger(ChuqinyangzhiCollectionController.class);

    private static final String TABLE_NAME = "chuqinyangzhiCollection";

    @Autowired
    private ChuqinyangzhiCollectionService chuqinyangzhiCollectionService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private ChuqinyangzhiService chuqinyangzhiService;//畜禽养殖
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
    private NongyekejiCollectionService nongyekejiCollectionService;//农业科技收藏
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
        PageUtils page = chuqinyangzhiCollectionService.queryPage(params);

        //字典表数据转换
        List<ChuqinyangzhiCollectionView> list =(List<ChuqinyangzhiCollectionView>)page.getList();
        for(ChuqinyangzhiCollectionView c:list){
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
        ChuqinyangzhiCollectionEntity chuqinyangzhiCollection = chuqinyangzhiCollectionService.selectById(id);
        if(chuqinyangzhiCollection !=null){
            //entity转view
            ChuqinyangzhiCollectionView view = new ChuqinyangzhiCollectionView();
            BeanUtils.copyProperties( chuqinyangzhiCollection , view );//把实体数据重构到view中
            //级联表 畜禽养殖
            //级联表
            ChuqinyangzhiEntity chuqinyangzhi = chuqinyangzhiService.selectById(chuqinyangzhiCollection.getChuqinyangzhiId());
            if(chuqinyangzhi != null){
            BeanUtils.copyProperties( chuqinyangzhi , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setChuqinyangzhiId(chuqinyangzhi.getId());
            }
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(chuqinyangzhiCollection.getYonghuId());
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
    public R save(@RequestBody ChuqinyangzhiCollectionEntity chuqinyangzhiCollection, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,chuqinyangzhiCollection:{}",this.getClass().getName(),chuqinyangzhiCollection.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            chuqinyangzhiCollection.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<ChuqinyangzhiCollectionEntity> queryWrapper = new EntityWrapper<ChuqinyangzhiCollectionEntity>()
            .eq("chuqinyangzhi_id", chuqinyangzhiCollection.getChuqinyangzhiId())
            .eq("yonghu_id", chuqinyangzhiCollection.getYonghuId())
            .eq("chuqinyangzhi_collection_types", chuqinyangzhiCollection.getChuqinyangzhiCollectionTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChuqinyangzhiCollectionEntity chuqinyangzhiCollectionEntity = chuqinyangzhiCollectionService.selectOne(queryWrapper);
        if(chuqinyangzhiCollectionEntity==null){
            chuqinyangzhiCollection.setInsertTime(new Date());
            chuqinyangzhiCollection.setCreateTime(new Date());
            chuqinyangzhiCollectionService.insert(chuqinyangzhiCollection);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ChuqinyangzhiCollectionEntity chuqinyangzhiCollection, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,chuqinyangzhiCollection:{}",this.getClass().getName(),chuqinyangzhiCollection.toString());
        ChuqinyangzhiCollectionEntity oldChuqinyangzhiCollectionEntity = chuqinyangzhiCollectionService.selectById(chuqinyangzhiCollection.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            chuqinyangzhiCollection.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

            chuqinyangzhiCollectionService.updateById(chuqinyangzhiCollection);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ChuqinyangzhiCollectionEntity> oldChuqinyangzhiCollectionList =chuqinyangzhiCollectionService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        chuqinyangzhiCollectionService.deleteBatchIds(Arrays.asList(ids));

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
            List<ChuqinyangzhiCollectionEntity> chuqinyangzhiCollectionList = new ArrayList<>();//上传的东西
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
                            ChuqinyangzhiCollectionEntity chuqinyangzhiCollectionEntity = new ChuqinyangzhiCollectionEntity();
//                            chuqinyangzhiCollectionEntity.setChuqinyangzhiId(Integer.valueOf(data.get(0)));   //畜禽养殖 要改的
//                            chuqinyangzhiCollectionEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            chuqinyangzhiCollectionEntity.setChuqinyangzhiCollectionTypes(Integer.valueOf(data.get(0)));   //类型 要改的
//                            chuqinyangzhiCollectionEntity.setInsertTime(date);//时间
//                            chuqinyangzhiCollectionEntity.setCreateTime(date);//时间
                            chuqinyangzhiCollectionList.add(chuqinyangzhiCollectionEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        chuqinyangzhiCollectionService.insertBatch(chuqinyangzhiCollectionList);
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
        PageUtils page = chuqinyangzhiCollectionService.queryPage(params);

        //字典表数据转换
        List<ChuqinyangzhiCollectionView> list =(List<ChuqinyangzhiCollectionView>)page.getList();
        for(ChuqinyangzhiCollectionView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChuqinyangzhiCollectionEntity chuqinyangzhiCollection = chuqinyangzhiCollectionService.selectById(id);
            if(chuqinyangzhiCollection !=null){


                //entity转view
                ChuqinyangzhiCollectionView view = new ChuqinyangzhiCollectionView();
                BeanUtils.copyProperties( chuqinyangzhiCollection , view );//把实体数据重构到view中

                //级联表
                    ChuqinyangzhiEntity chuqinyangzhi = chuqinyangzhiService.selectById(chuqinyangzhiCollection.getChuqinyangzhiId());
                if(chuqinyangzhi != null){
                    BeanUtils.copyProperties( chuqinyangzhi , view ,new String[]{ "id", "createDate"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setChuqinyangzhiId(chuqinyangzhi.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(chuqinyangzhiCollection.getYonghuId());
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
    public R add(@RequestBody ChuqinyangzhiCollectionEntity chuqinyangzhiCollection, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,chuqinyangzhiCollection:{}",this.getClass().getName(),chuqinyangzhiCollection.toString());
        Wrapper<ChuqinyangzhiCollectionEntity> queryWrapper = new EntityWrapper<ChuqinyangzhiCollectionEntity>()
            .eq("chuqinyangzhi_id", chuqinyangzhiCollection.getChuqinyangzhiId())
            .eq("yonghu_id", chuqinyangzhiCollection.getYonghuId())
            .eq("chuqinyangzhi_collection_types", chuqinyangzhiCollection.getChuqinyangzhiCollectionTypes())
//            .notIn("chuqinyangzhi_collection_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChuqinyangzhiCollectionEntity chuqinyangzhiCollectionEntity = chuqinyangzhiCollectionService.selectOne(queryWrapper);
        if(chuqinyangzhiCollectionEntity==null){
            chuqinyangzhiCollection.setInsertTime(new Date());
            chuqinyangzhiCollection.setCreateTime(new Date());
        chuqinyangzhiCollectionService.insert(chuqinyangzhiCollection);

            return R.ok();
        }else {
            return R.error(511,"您已经收藏过了");
        }
    }

}

