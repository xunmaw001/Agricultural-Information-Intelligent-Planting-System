
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
 * 水产养殖
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/shuichanyangzhi")
public class ShuichanyangzhiController {
    private static final Logger logger = LoggerFactory.getLogger(ShuichanyangzhiController.class);

    private static final String TABLE_NAME = "shuichanyangzhi";

    @Autowired
    private ShuichanyangzhiService shuichanyangzhiService;


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
    private NongyekejiCollectionService nongyekejiCollectionService;//农业科技收藏
    @Autowired
    private NongyekejiLiuyanService nongyekejiLiuyanService;//农业科技留言
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
        params.put("shuichanyangzhiDeleteStart",1);params.put("shuichanyangzhiDeleteEnd",1);
        CommonUtil.checkMap(params);
        PageUtils page = shuichanyangzhiService.queryPage(params);

        //字典表数据转换
        List<ShuichanyangzhiView> list =(List<ShuichanyangzhiView>)page.getList();
        for(ShuichanyangzhiView c:list){
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
        ShuichanyangzhiEntity shuichanyangzhi = shuichanyangzhiService.selectById(id);
        if(shuichanyangzhi !=null){
            //entity转view
            ShuichanyangzhiView view = new ShuichanyangzhiView();
            BeanUtils.copyProperties( shuichanyangzhi , view );//把实体数据重构到view中
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
    public R save(@RequestBody ShuichanyangzhiEntity shuichanyangzhi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,shuichanyangzhi:{}",this.getClass().getName(),shuichanyangzhi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ShuichanyangzhiEntity> queryWrapper = new EntityWrapper<ShuichanyangzhiEntity>()
            .eq("shuichanyangzhi_name", shuichanyangzhi.getShuichanyangzhiName())
            .eq("shuichanyangzhi_types", shuichanyangzhi.getShuichanyangzhiTypes())
            .eq("shangxia_types", shuichanyangzhi.getShangxiaTypes())
            .eq("shuichanyangzhi_delete", shuichanyangzhi.getShuichanyangzhiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShuichanyangzhiEntity shuichanyangzhiEntity = shuichanyangzhiService.selectOne(queryWrapper);
        if(shuichanyangzhiEntity==null){
            shuichanyangzhi.setShuichanyangzhiClicknum(1);
            shuichanyangzhi.setShangxiaTypes(1);
            shuichanyangzhi.setShuichanyangzhiDelete(1);
            shuichanyangzhi.setInsertTime(new Date());
            shuichanyangzhi.setCreateTime(new Date());
            shuichanyangzhiService.insert(shuichanyangzhi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ShuichanyangzhiEntity shuichanyangzhi, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,shuichanyangzhi:{}",this.getClass().getName(),shuichanyangzhi.toString());
        ShuichanyangzhiEntity oldShuichanyangzhiEntity = shuichanyangzhiService.selectById(shuichanyangzhi.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(shuichanyangzhi.getShuichanyangzhiPhoto()) || "null".equals(shuichanyangzhi.getShuichanyangzhiPhoto())){
                shuichanyangzhi.setShuichanyangzhiPhoto(null);
        }

            shuichanyangzhiService.updateById(shuichanyangzhi);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ShuichanyangzhiEntity> oldShuichanyangzhiList =shuichanyangzhiService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        ArrayList<ShuichanyangzhiEntity> list = new ArrayList<>();
        for(Integer id:ids){
            ShuichanyangzhiEntity shuichanyangzhiEntity = new ShuichanyangzhiEntity();
            shuichanyangzhiEntity.setId(id);
            shuichanyangzhiEntity.setShuichanyangzhiDelete(2);
            list.add(shuichanyangzhiEntity);
        }
        if(list != null && list.size() >0){
            shuichanyangzhiService.updateBatchById(list);
        }

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
            List<ShuichanyangzhiEntity> shuichanyangzhiList = new ArrayList<>();//上传的东西
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
                            ShuichanyangzhiEntity shuichanyangzhiEntity = new ShuichanyangzhiEntity();
//                            shuichanyangzhiEntity.setShuichanyangzhiName(data.get(0));                    //水产养殖标题 要改的
//                            shuichanyangzhiEntity.setShuichanyangzhiUuidNumber(data.get(0));                    //水产养殖编号 要改的
//                            shuichanyangzhiEntity.setShuichanyangzhiPhoto("");//详情和图片
//                            shuichanyangzhiEntity.setShuichanyangzhiTypes(Integer.valueOf(data.get(0)));   //水产养殖类型 要改的
//                            shuichanyangzhiEntity.setShuichanyangzhiClicknum(Integer.valueOf(data.get(0)));   //水产养殖热度 要改的
//                            shuichanyangzhiEntity.setShuichanyangzhiContent("");//详情和图片
//                            shuichanyangzhiEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            shuichanyangzhiEntity.setShuichanyangzhiDelete(1);//逻辑删除字段
//                            shuichanyangzhiEntity.setInsertTime(date);//时间
//                            shuichanyangzhiEntity.setCreateTime(date);//时间
                            shuichanyangzhiList.add(shuichanyangzhiEntity);


                            //把要查询是否重复的字段放入map中
                                //水产养殖编号
                                if(seachFields.containsKey("shuichanyangzhiUuidNumber")){
                                    List<String> shuichanyangzhiUuidNumber = seachFields.get("shuichanyangzhiUuidNumber");
                                    shuichanyangzhiUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> shuichanyangzhiUuidNumber = new ArrayList<>();
                                    shuichanyangzhiUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("shuichanyangzhiUuidNumber",shuichanyangzhiUuidNumber);
                                }
                        }

                        //查询是否重复
                         //水产养殖编号
                        List<ShuichanyangzhiEntity> shuichanyangzhiEntities_shuichanyangzhiUuidNumber = shuichanyangzhiService.selectList(new EntityWrapper<ShuichanyangzhiEntity>().in("shuichanyangzhi_uuid_number", seachFields.get("shuichanyangzhiUuidNumber")).eq("shuichanyangzhi_delete", 1));
                        if(shuichanyangzhiEntities_shuichanyangzhiUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ShuichanyangzhiEntity s:shuichanyangzhiEntities_shuichanyangzhiUuidNumber){
                                repeatFields.add(s.getShuichanyangzhiUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [水产养殖编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        shuichanyangzhiService.insertBatch(shuichanyangzhiList);
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
    * 个性推荐
    */
    @IgnoreAuth
    @RequestMapping("/gexingtuijian")
    public R gexingtuijian(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("gexingtuijian方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        CommonUtil.checkMap(params);
        List<ShuichanyangzhiView> returnShuichanyangzhiViewList = new ArrayList<>();

        //查看收藏
        Map<String, Object> params1 = new HashMap<>(params);params1.put("sort","id");params1.put("yonghuId",request.getSession().getAttribute("userId"));
        PageUtils pageUtils = shuichanyangzhiCollectionService.queryPage(params1);
        List<ShuichanyangzhiCollectionView> collectionViewsList =(List<ShuichanyangzhiCollectionView>)pageUtils.getList();
        Map<Integer,Integer> typeMap=new HashMap<>();//购买的类型list
        for(ShuichanyangzhiCollectionView collectionView:collectionViewsList){
            Integer shuichanyangzhiTypes = collectionView.getShuichanyangzhiTypes();
            if(typeMap.containsKey(shuichanyangzhiTypes)){
                typeMap.put(shuichanyangzhiTypes,typeMap.get(shuichanyangzhiTypes)+1);
            }else{
                typeMap.put(shuichanyangzhiTypes,1);
            }
        }
        List<Integer> typeList = new ArrayList<>();//排序后的有序的类型 按最多到最少
        typeMap.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue()).forEach(e -> typeList.add(e.getKey()));//排序
        Integer limit = Integer.valueOf(String.valueOf(params.get("limit")));
        for(Integer type:typeList){
            Map<String, Object> params2 = new HashMap<>(params);params2.put("shuichanyangzhiTypes",type);
            PageUtils pageUtils1 = shuichanyangzhiService.queryPage(params2);
            List<ShuichanyangzhiView> shuichanyangzhiViewList =(List<ShuichanyangzhiView>)pageUtils1.getList();
            returnShuichanyangzhiViewList.addAll(shuichanyangzhiViewList);
            if(returnShuichanyangzhiViewList.size()>= limit) break;//返回的推荐数量大于要的数量 跳出循环
        }
        //正常查询出来商品,用于补全推荐缺少的数据
        PageUtils page = shuichanyangzhiService.queryPage(params);
        if(returnShuichanyangzhiViewList.size()<limit){//返回数量还是小于要求数量
            int toAddNum = limit - returnShuichanyangzhiViewList.size();//要添加的数量
            List<ShuichanyangzhiView> shuichanyangzhiViewList =(List<ShuichanyangzhiView>)page.getList();
            for(ShuichanyangzhiView shuichanyangzhiView:shuichanyangzhiViewList){
                Boolean addFlag = true;
                for(ShuichanyangzhiView returnShuichanyangzhiView:returnShuichanyangzhiViewList){
                    if(returnShuichanyangzhiView.getId().intValue() ==shuichanyangzhiView.getId().intValue()) addFlag=false;//返回的数据中已存在此商品
                }
                if(addFlag){
                    toAddNum=toAddNum-1;
                    returnShuichanyangzhiViewList.add(shuichanyangzhiView);
                    if(toAddNum==0) break;//够数量了
                }
            }
        }else {
            returnShuichanyangzhiViewList = returnShuichanyangzhiViewList.subList(0, limit);
        }

        for(ShuichanyangzhiView c:returnShuichanyangzhiViewList)
            dictionaryService.dictionaryConvert(c, request);
        page.setList(returnShuichanyangzhiViewList);
        return R.ok().put("data", page);
    }

    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = shuichanyangzhiService.queryPage(params);

        //字典表数据转换
        List<ShuichanyangzhiView> list =(List<ShuichanyangzhiView>)page.getList();
        for(ShuichanyangzhiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ShuichanyangzhiEntity shuichanyangzhi = shuichanyangzhiService.selectById(id);
            if(shuichanyangzhi !=null){

                //点击数量加1
                shuichanyangzhi.setShuichanyangzhiClicknum(shuichanyangzhi.getShuichanyangzhiClicknum()+1);
                shuichanyangzhiService.updateById(shuichanyangzhi);

                //entity转view
                ShuichanyangzhiView view = new ShuichanyangzhiView();
                BeanUtils.copyProperties( shuichanyangzhi , view );//把实体数据重构到view中

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
    public R add(@RequestBody ShuichanyangzhiEntity shuichanyangzhi, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,shuichanyangzhi:{}",this.getClass().getName(),shuichanyangzhi.toString());
        Wrapper<ShuichanyangzhiEntity> queryWrapper = new EntityWrapper<ShuichanyangzhiEntity>()
            .eq("shuichanyangzhi_name", shuichanyangzhi.getShuichanyangzhiName())
            .eq("shuichanyangzhi_uuid_number", shuichanyangzhi.getShuichanyangzhiUuidNumber())
            .eq("shuichanyangzhi_types", shuichanyangzhi.getShuichanyangzhiTypes())
            .eq("shuichanyangzhi_clicknum", shuichanyangzhi.getShuichanyangzhiClicknum())
            .eq("shangxia_types", shuichanyangzhi.getShangxiaTypes())
            .eq("shuichanyangzhi_delete", shuichanyangzhi.getShuichanyangzhiDelete())
//            .notIn("shuichanyangzhi_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ShuichanyangzhiEntity shuichanyangzhiEntity = shuichanyangzhiService.selectOne(queryWrapper);
        if(shuichanyangzhiEntity==null){
            shuichanyangzhi.setShuichanyangzhiDelete(1);
            shuichanyangzhi.setInsertTime(new Date());
            shuichanyangzhi.setCreateTime(new Date());
        shuichanyangzhiService.insert(shuichanyangzhi);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

