import Vue from "vue"; //导入 Vue 模块
import VueRouter from "vue-router";// 第二步：导入 VueRouter 模块
import User from "@/views/User.vue";
Vue.use(VueRouter); //第三步：Vue.use 安装注册
const routes = [
    {
        path: "/",
        redirect:"/user"
    },
    {
        path: "/user",
        component: User
    },
    {
        path: "*", //匹配上述两条规则之外的所有路径
        component: NotFound
    }
]
const router = new VueRouter({ //第四步：创建 VueRouter 对象
    routes: routes
});
export default router;