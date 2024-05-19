import Vue from "vue"; //导入 Vue 模块
import VueRouter from "vue-router"; // 第二步：导入 VueRouter 模块
Vue.use(VueRouter); //第三步：Vue.use 安装注册
const router = new VueRouter({ //第四步：创建 VueRouter 对象
    routes:[
        {
            path:"/user",
            component:()=>import("@/views/User.vue")
        },
        {
            path:"/",
            component:()=>import("@/views/Home.vue")
            //redirect:"/user"
        },
        {
            path:"*",
            component:()=>import("@/views/NotFound.vue")
        }
    ]
});
export default router; //导出此模块
