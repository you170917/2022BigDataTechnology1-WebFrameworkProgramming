import Vue from "vue";  //导入 Vue 模块
import VueRouter from "vue-router";
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue"; // 第二步：导入 VueRouter 模块
Vue.use(VueRouter); //第三步：Vue.use 安装注册
const routes = [
    {
        path:"/",
        redirect:"/user"
    },
    {
    path:"/user",
    component: User
    },
    {
        path:"*",
        component: NotFound
    }
]
const router =new VueRouter({
    router: routes
});
export default router;  //导出此模块
