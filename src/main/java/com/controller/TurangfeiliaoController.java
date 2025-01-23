
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
 * 土壤肥料
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/turangfeiliao")
public class TurangfeiliaoController {
    private static final Logger logger = LoggerFactory.getLogger(TurangfeiliaoController.class);

    private static final String TABLE_NAME = "turangfeiliao";

    @Autowired
    private TurangfeiliaoService turangfeiliaoService;


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
    private ShuichanyangzhiService shuichanyangzhiService;//水产养殖
    @Autowired
    private ShuichanyangzhiCollectionService shuichanyangzhiCollectionService;//水产养殖收藏
    @Autowired
    private ShuichanyangzhiLiuyanService shuichanyangzhiLiuyanService;//水产养殖留言
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
        params.put("turangfeiliaoDeleteStart",1);params.put("turangfeiliaoDeleteEnd",1);
        CommonUtil.checkMap(params);
        PageUtils page = turangfeiliaoService.queryPage(params);

        //字典表数据转换
        List<TurangfeiliaoView> list =(List<TurangfeiliaoView>)page.getList();
        for(TurangfeiliaoView c:list){
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
        TurangfeiliaoEntity turangfeiliao = turangfeiliaoService.selectById(id);
        if(turangfeiliao !=null){
            //entity转view
            TurangfeiliaoView view = new TurangfeiliaoView();
            BeanUtils.copyProperties( turangfeiliao , view );//把实体数据重构到view中
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
    public R save(@RequestBody TurangfeiliaoEntity turangfeiliao, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,turangfeiliao:{}",this.getClass().getName(),turangfeiliao.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<TurangfeiliaoEntity> queryWrapper = new EntityWrapper<TurangfeiliaoEntity>()
            .eq("turangfeiliao_name", turangfeiliao.getTurangfeiliaoName())
            .eq("turangfeiliao_types", turangfeiliao.getTurangfeiliaoTypes())
            .eq("shangxia_types", turangfeiliao.getShangxiaTypes())
            .eq("turangfeiliao_delete", turangfeiliao.getTurangfeiliaoDelete())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        TurangfeiliaoEntity turangfeiliaoEntity = turangfeiliaoService.selectOne(queryWrapper);
        if(turangfeiliaoEntity==null){
            turangfeiliao.setTurangfeiliaoClicknum(1);
            turangfeiliao.setShangxiaTypes(1);
            turangfeiliao.setTurangfeiliaoDelete(1);
            turangfeiliao.setInsertTime(new Date());
            turangfeiliao.setCreateTime(new Date());
            turangfeiliaoService.insert(turangfeiliao);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody TurangfeiliaoEntity turangfeiliao, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,turangfeiliao:{}",this.getClass().getName(),turangfeiliao.toString());
        TurangfeiliaoEntity oldTurangfeiliaoEntity = turangfeiliaoService.selectById(turangfeiliao.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(turangfeiliao.getTurangfeiliaoPhoto()) || "null".equals(turangfeiliao.getTurangfeiliaoPhoto())){
                turangfeiliao.setTurangfeiliaoPhoto(null);
        }

            turangfeiliaoService.updateById(turangfeiliao);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<TurangfeiliaoEntity> oldTurangfeiliaoList =turangfeiliaoService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        ArrayList<TurangfeiliaoEntity> list = new ArrayList<>();
        for(Integer id:ids){
            TurangfeiliaoEntity turangfeiliaoEntity = new TurangfeiliaoEntity();
            turangfeiliaoEntity.setId(id);
            turangfeiliaoEntity.setTurangfeiliaoDelete(2);
            list.add(turangfeiliaoEntity);
        }
        if(list != null && list.size() >0){
            turangfeiliaoService.updateBatchById(list);
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
            List<TurangfeiliaoEntity> turangfeiliaoList = new ArrayList<>();//上传的东西
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
                            TurangfeiliaoEntity turangfeiliaoEntity = new TurangfeiliaoEntity();
//                            turangfeiliaoEntity.setTurangfeiliaoName(data.get(0));                    //土壤肥料标题 要改的
//                            turangfeiliaoEntity.setTurangfeiliaoUuidNumber(data.get(0));                    //土壤肥料编号 要改的
//                            turangfeiliaoEntity.setTurangfeiliaoPhoto("");//详情和图片
//                            turangfeiliaoEntity.setTurangfeiliaoTypes(Integer.valueOf(data.get(0)));   //土壤肥料类型 要改的
//                            turangfeiliaoEntity.setTurangfeiliaoClicknum(Integer.valueOf(data.get(0)));   //土壤肥料热度 要改的
//                            turangfeiliaoEntity.setTurangfeiliaoContent("");//详情和图片
//                            turangfeiliaoEntity.setShangxiaTypes(Integer.valueOf(data.get(0)));   //是否上架 要改的
//                            turangfeiliaoEntity.setTurangfeiliaoDelete(1);//逻辑删除字段
//                            turangfeiliaoEntity.setInsertTime(date);//时间
//                            turangfeiliaoEntity.setCreateTime(date);//时间
                            turangfeiliaoList.add(turangfeiliaoEntity);


                            //把要查询是否重复的字段放入map中
                                //土壤肥料编号
                                if(seachFields.containsKey("turangfeiliaoUuidNumber")){
                                    List<String> turangfeiliaoUuidNumber = seachFields.get("turangfeiliaoUuidNumber");
                                    turangfeiliaoUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> turangfeiliaoUuidNumber = new ArrayList<>();
                                    turangfeiliaoUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("turangfeiliaoUuidNumber",turangfeiliaoUuidNumber);
                                }
                        }

                        //查询是否重复
                         //土壤肥料编号
                        List<TurangfeiliaoEntity> turangfeiliaoEntities_turangfeiliaoUuidNumber = turangfeiliaoService.selectList(new EntityWrapper<TurangfeiliaoEntity>().in("turangfeiliao_uuid_number", seachFields.get("turangfeiliaoUuidNumber")).eq("turangfeiliao_delete", 1));
                        if(turangfeiliaoEntities_turangfeiliaoUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(TurangfeiliaoEntity s:turangfeiliaoEntities_turangfeiliaoUuidNumber){
                                repeatFields.add(s.getTurangfeiliaoUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [土壤肥料编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        turangfeiliaoService.insertBatch(turangfeiliaoList);
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
        List<TurangfeiliaoView> returnTurangfeiliaoViewList = new ArrayList<>();

        //查看收藏
        Map<String, Object> params1 = new HashMap<>(params);params1.put("sort","id");params1.put("yonghuId",request.getSession().getAttribute("userId"));
        PageUtils pageUtils = turangfeiliaoCollectionService.queryPage(params1);
        List<TurangfeiliaoCollectionView> collectionViewsList =(List<TurangfeiliaoCollectionView>)pageUtils.getList();
        Map<Integer,Integer> typeMap=new HashMap<>();//购买的类型list
        for(TurangfeiliaoCollectionView collectionView:collectionViewsList){
            Integer turangfeiliaoTypes = collectionView.getTurangfeiliaoTypes();
            if(typeMap.containsKey(turangfeiliaoTypes)){
                typeMap.put(turangfeiliaoTypes,typeMap.get(turangfeiliaoTypes)+1);
            }else{
                typeMap.put(turangfeiliaoTypes,1);
            }
        }
        List<Integer> typeList = new ArrayList<>();//排序后的有序的类型 按最多到最少
        typeMap.entrySet().stream().sorted((o1, o2) -> o2.getValue() - o1.getValue()).forEach(e -> typeList.add(e.getKey()));//排序
        Integer limit = Integer.valueOf(String.valueOf(params.get("limit")));
        for(Integer type:typeList){
            Map<String, Object> params2 = new HashMap<>(params);params2.put("turangfeiliaoTypes",type);
            PageUtils pageUtils1 = turangfeiliaoService.queryPage(params2);
            List<TurangfeiliaoView> turangfeiliaoViewList =(List<TurangfeiliaoView>)pageUtils1.getList();
            returnTurangfeiliaoViewList.addAll(turangfeiliaoViewList);
            if(returnTurangfeiliaoViewList.size()>= limit) break;//返回的推荐数量大于要的数量 跳出循环
        }
        //正常查询出来商品,用于补全推荐缺少的数据
        PageUtils page = turangfeiliaoService.queryPage(params);
        if(returnTurangfeiliaoViewList.size()<limit){//返回数量还是小于要求数量
            int toAddNum = limit - returnTurangfeiliaoViewList.size();//要添加的数量
            List<TurangfeiliaoView> turangfeiliaoViewList =(List<TurangfeiliaoView>)page.getList();
            for(TurangfeiliaoView turangfeiliaoView:turangfeiliaoViewList){
                Boolean addFlag = true;
                for(TurangfeiliaoView returnTurangfeiliaoView:returnTurangfeiliaoViewList){
                    if(returnTurangfeiliaoView.getId().intValue() ==turangfeiliaoView.getId().intValue()) addFlag=false;//返回的数据中已存在此商品
                }
                if(addFlag){
                    toAddNum=toAddNum-1;
                    returnTurangfeiliaoViewList.add(turangfeiliaoView);
                    if(toAddNum==0) break;//够数量了
                }
            }
        }else {
            returnTurangfeiliaoViewList = returnTurangfeiliaoViewList.subList(0, limit);
        }

        for(TurangfeiliaoView c:returnTurangfeiliaoViewList)
            dictionaryService.dictionaryConvert(c, request);
        page.setList(returnTurangfeiliaoViewList);
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
        PageUtils page = turangfeiliaoService.queryPage(params);

        //字典表数据转换
        List<TurangfeiliaoView> list =(List<TurangfeiliaoView>)page.getList();
        for(TurangfeiliaoView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        TurangfeiliaoEntity turangfeiliao = turangfeiliaoService.selectById(id);
            if(turangfeiliao !=null){

                //点击数量加1
                turangfeiliao.setTurangfeiliaoClicknum(turangfeiliao.getTurangfeiliaoClicknum()+1);
                turangfeiliaoService.updateById(turangfeiliao);

                //entity转view
                TurangfeiliaoView view = new TurangfeiliaoView();
                BeanUtils.copyProperties( turangfeiliao , view );//把实体数据重构到view中

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
    public R add(@RequestBody TurangfeiliaoEntity turangfeiliao, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,turangfeiliao:{}",this.getClass().getName(),turangfeiliao.toString());
        Wrapper<TurangfeiliaoEntity> queryWrapper = new EntityWrapper<TurangfeiliaoEntity>()
            .eq("turangfeiliao_name", turangfeiliao.getTurangfeiliaoName())
            .eq("turangfeiliao_uuid_number", turangfeiliao.getTurangfeiliaoUuidNumber())
            .eq("turangfeiliao_types", turangfeiliao.getTurangfeiliaoTypes())
            .eq("turangfeiliao_clicknum", turangfeiliao.getTurangfeiliaoClicknum())
            .eq("shangxia_types", turangfeiliao.getShangxiaTypes())
            .eq("turangfeiliao_delete", turangfeiliao.getTurangfeiliaoDelete())
//            .notIn("turangfeiliao_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        TurangfeiliaoEntity turangfeiliaoEntity = turangfeiliaoService.selectOne(queryWrapper);
        if(turangfeiliaoEntity==null){
            turangfeiliao.setTurangfeiliaoDelete(1);
            turangfeiliao.setInsertTime(new Date());
            turangfeiliao.setCreateTime(new Date());
        turangfeiliaoService.insert(turangfeiliao);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

