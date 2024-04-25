import Vue from "vue"; //导入 Vue 模块
import VueRouter from "vue-router";
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue";
// 第二步：导入 VueRouter 模块
Vue.use(VueRouter); //第三步：Vue.use 安装注册
const routes=[
    {
        path:"/user",
        component: User

    },
    {
        path:"/",
        redirect:"/user"
    },
    {
        path:"*",
        component: NotFound
    },
    {
        path:"/",
        component:()=>import("@/views/Home.vue")
    }
]
const router = new VueRouter({ //第四步：创建 VueRouter 对象
    routes:routes
    //routes
});
export default router//导出此模块