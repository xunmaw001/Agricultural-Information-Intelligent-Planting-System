
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
 * 畜禽养殖
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/chuqinyangzhi")
public class ChuqinyangzhiController {
    private static final Logger logger = LoggerFactory.getLogger(ChuqinyangzhiController.class);

    private static final String TABLE_NAME = "chuqinyangzhi";

    @Autowired
    private ChuqinyangzhiService chuqinyangzhiService;


    @Autowired
    private TokenService tokenService;

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
        params.put("chuqinyangzhiDeleteStart",1);params.put("chuqinyangzhiDeleteEnd",1);
        CommonUtil.checkMap(params);
        PageUtils page = chuqinyangzhiService.queryPage(params);

        //字典表数据转换
        List<ChuqinyangzhiView> list =(List<ChuqinyangzhiView>)page.getList();
        for(ChuqinyangzhiView c:list){
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
        ChuqinyangzhiEntity chuqinyangzhi = chuqinyangzhiService.selectById(id);
        if(chuqinyangzhi !=null){
            //entity转view
            ChuqinyangzhiView view = new ChuqinyangzhiView();
            BeanUtils.copyProperties( chuqinyangzhi , view );//把实体数据重构到view中
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
    public R save(@RequestBody ChuqinyangzhiEntity chuqinyangzhi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,chuqinyangzhi:{}",this.getClass().getName(),chuqinyangzhi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ChuqinyangzhiEntity> queryWrapper = new EntityWrapper<ChuqinyangzhiEntity>()
            .eq("chuqinyangzhi_name", chuqinyangzhi.getChuqinyangzhiName())
            .eq("chuqinyangzhi_types", chuqinyangzhi.getChuqinyangzhiTypes())
            .eq("shangxia_types", chuqinyangzhi.getShangxiaTypes())
            .eq("chuqinyangzhi_delete", chuqinyangzhi.getChuqinyangzhiDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChuqinyangzhiEntity chuqinyangzhiEntity = chuqinyangzhiService.selectOne(queryWrapper);
        if(chuqinyangzhiEntity==null){
            chuqinyangzhi.setChuqinyangzhiClicknum(1);
            chuqinyangzhi.setShangxiaTypes(1);
            chuqinyangzhi.setChuqinyangzhiDelete(1);
            chuqinyangzhi.setInsertTime(new Date());
            chuqinyangzhi.setCreateTime(new Date());
            chuqinyangzhiService.insert(chuqinyangzhi);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ChuqinyangzhiEntity chuqinyangzhi, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,chuqinyangzhi:{}",this.getClass().getName(),chuqinyangzhi.toString());
        ChuqinyangzhiEntity oldChuqinyangzhiEntity = chuqinyangzhiService.selectById(chuqinyangzhi.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(chuqinyangzhi.getChuqinyangzhiPhoto()) || "null".equals(chuqinyangzhi.getChuqinyangzhiPhoto())){
                chuqinyangzhi.setChuqinyangzhiPhoto(null);
        }

            chuqinyangzhiService.updateById(chuqinyangzhi);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<ChuqinyangzhiEntity> oldChuqinyangzhiList =chuqinyangzhiService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        ArrayList<ChuqinyangzhiEntity> list = new ArrayList<>();
        for(Integer id:ids){
            ChuqinyangzhiEntity chuqinyangzhiEntity = new ChuqinyangzhiEntity();
            chuqinyangzhiEntity.setId(id);
            chuqinyangzhiEntity.setChuqinyangzhiDelete(2);
            list.add(chuqinyangzhiEntity);
        }
        if(list != null && list.size() >0){
            chuqinyangzhiService.updateBatchById(list);
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
            List<ChuqinyangzhiEntity> chuqinyangzhiList = new ArrayList<>();//上传的东西
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
                            ChuqinyangzhiEntity chuqinyangzhiEntity = new ChuqinyangzhiEntity();
//                            chuqinyangzhiEntity.setChuqinyangzhiName(data.get(0));                    //畜禽养殖标题 要改的
//                            chuqinyangzhiEntity.setChuqinyangzhiUuidNumber(data.get(0));                    //畜禽养殖编号 要改的
//                            chuqinyangzhiEntity.setChuqinyangzhiPhoto("");//详情和图片
//                            chuqinyangzhiEntity.setChuqinyangzhiTypes(Integer.valueOf(data.get(0)));   //畜禽养殖类型 要改的
//                            chuqinyangzhiEntity.setChuqinyangzhiClicknum(Integer.valueOf(data.get(0)));   //畜禽养殖热度 要改的
//                            chuqinyangzhiEntity.setChuqinyangzhiContent("");//详情和图片
//                            chuqinyangzhiEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            chuqinyangzhiEntity.setChuqinyangzhiDelete(1);//逻辑删除字段
//                            chuqinyangzhiEntity.setInsertTime(date);//时间
//                            chuqinyangzhiEntity.setCreateTime(date);//时间
                            chuqinyangzhiList.add(chuqinyangzhiEntity);


                            //把要查询是否重复的字段放入map中
                                //畜禽养殖编号
                                if(seachFields.containsKey("chuqinyangzhiUuidNumber")){
                                    List<String> chuqinyangzhiUuidNumber = seachFields.get("chuqinyangzhiUuidNumber");
                                    chuqinyangzhiUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> chuqinyangzhiUuidNumber = new ArrayList<>();
                                    chuqinyangzhiUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("chuqinyangzhiUuidNumber",chuqinyangzhiUuidNumber);
                                }
                        }

                        //查询是否重复
                         //畜禽养殖编号
                        List<ChuqinyangzhiEntity> chuqinyangzhiEntities_chuqinyangzhiUuidNumber = chuqinyangzhiService.selectList(new EntityWrapper<ChuqinyangzhiEntity>().in("chuqinyangzhi_uuid_number", seachFields.get("chuqinyangzhiUuidNumber")).eq("chuqinyangzhi_delete", 1));
                        if(chuqinyangzhiEntities_chuqinyangzhiUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(ChuqinyangzhiEntity s:chuqinyangzhiEntities_chuqinyangzhiUuidNumber){
                                repeatFields.add(s.getChuqinyangzhiUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [畜禽养殖编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        chuqinyangzhiService.insertBatch(chuqinyangzhiList);
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
        List<ChuqinyangzhiView> returnChuqinyangzhiViewList = new ArrayList<>();

        //查看收藏
        Map<String, Object> params1 = new HashMap<>(params);params1.put("sort","id");params1.put("yonghuId",request.getSession().getAttribute("userId"));
        PageUtils pageUtils = chuqinyangzhiCollectionService.queryPage(params1);
        List<ChuqinyangzhiCollectionView> collectionViewsList =(List<ChuqinyangzhiCollectionView>)pageUtils.getList();
        Map<Integer,Integer> typeMap=new HashMap<>();//购买的类型list
        for(ChuqinyangzhiCollectionView collectionView:collectionViewsList){
            Integer chuqinyangzhiTypes = collectionView.getChuqinyangzhiTypes();
            if(typeMap.containsKey(chuqinyangzhiTypes)){
                typeMap.put(chuqinyangzhiTypes,typeMap.get(chuqinyangzhiTypes)+1);
            }else{
                typeMap.put(chuqinyangzhiTypes,1);
            }
        }
        List<Integer> typeList = new ArrayList<>();//排序后的有序的类型 按最多到最少
        typeMap.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue()).forEach(e -> typeList.add(e.getKey()));//排序
        Integer limit = Integer.valueOf(String.valueOf(params.get("limit")));
        for(Integer type:typeList){
            Map<String, Object> params2 = new HashMap<>(params);params2.put("chuqinyangzhiTypes",type);
            PageUtils pageUtils1 = chuqinyangzhiService.queryPage(params2);
            List<ChuqinyangzhiView> chuqinyangzhiViewList =(List<ChuqinyangzhiView>)pageUtils1.getList();
            returnChuqinyangzhiViewList.addAll(chuqinyangzhiViewList);
            if(returnChuqinyangzhiViewList.size()>= limit) break;//返回的推荐数量大于要的数量 跳出循环
        }
        //正常查询出来商品,用于补全推荐缺少的数据
        PageUtils page = chuqinyangzhiService.queryPage(params);
        if(returnChuqinyangzhiViewList.size()<limit){//返回数量还是小于要求数量
            int toAddNum = limit - returnChuqinyangzhiViewList.size();//要添加的数量
            List<ChuqinyangzhiView> chuqinyangzhiViewList =(List<ChuqinyangzhiView>)page.getList();
            for(ChuqinyangzhiView chuqinyangzhiView:chuqinyangzhiViewList){
                Boolean addFlag = true;
                for(ChuqinyangzhiView returnChuqinyangzhiView:returnChuqinyangzhiViewList){
                    if(returnChuqinyangzhiView.getId().intValue() ==chuqinyangzhiView.getId().intValue()) addFlag=false;//返回的数据中已存在此商品
                }
                if(addFlag){
                    toAddNum=toAddNum-1;
                    returnChuqinyangzhiViewList.add(chuqinyangzhiView);
                    if(toAddNum==0) break;//够数量了
                }
            }
        }else {
            returnChuqinyangzhiViewList = returnChuqinyangzhiViewList.subList(0, limit);
        }

        for(ChuqinyangzhiView c:returnChuqinyangzhiViewList)
            dictionaryService.dictionaryConvert(c, request);
        page.setList(returnChuqinyangzhiViewList);
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
        PageUtils page = chuqinyangzhiService.queryPage(params);

        //字典表数据转换
        List<ChuqinyangzhiView> list =(List<ChuqinyangzhiView>)page.getList();
        for(ChuqinyangzhiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ChuqinyangzhiEntity chuqinyangzhi = chuqinyangzhiService.selectById(id);
            if(chuqinyangzhi !=null){

                //点击数量加1
                chuqinyangzhi.setChuqinyangzhiClicknum(chuqinyangzhi.getChuqinyangzhiClicknum()+1);
                chuqinyangzhiService.updateById(chuqinyangzhi);

                //entity转view
                ChuqinyangzhiView view = new ChuqinyangzhiView();
                BeanUtils.copyProperties( chuqinyangzhi , view );//把实体数据重构到view中

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
    public R add(@RequestBody ChuqinyangzhiEntity chuqinyangzhi, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,chuqinyangzhi:{}",this.getClass().getName(),chuqinyangzhi.toString());
        Wrapper<ChuqinyangzhiEntity> queryWrapper = new EntityWrapper<ChuqinyangzhiEntity>()
            .eq("chuqinyangzhi_name", chuqinyangzhi.getChuqinyangzhiName())
            .eq("chuqinyangzhi_uuid_number", chuqinyangzhi.getChuqinyangzhiUuidNumber())
            .eq("chuqinyangzhi_types", chuqinyangzhi.getChuqinyangzhiTypes())
            .eq("chuqinyangzhi_clicknum", chuqinyangzhi.getChuqinyangzhiClicknum())
            .eq("shangxia_types", chuqinyangzhi.getShangxiaTypes())
            .eq("chuqinyangzhi_delete", chuqinyangzhi.getChuqinyangzhiDelete())
//            .notIn("chuqinyangzhi_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ChuqinyangzhiEntity chuqinyangzhiEntity = chuqinyangzhiService.selectOne(queryWrapper);
        if(chuqinyangzhiEntity==null){
            chuqinyangzhi.setChuqinyangzhiDelete(1);
            chuqinyangzhi.setInsertTime(new Date());
            chuqinyangzhi.setCreateTime(new Date());
        chuqinyangzhiService.insert(chuqinyangzhi);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

