import Vue from "vue";
import VueRouter from "vue-router";
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue";
import MyUser from "@/views/MyUser.vue";
Vue.use(VueRouter);
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
    },
    {
        path: "/myUser",
        component: MyUser
    }
]
const router = new VueRouter({
    routes: routes
});
export default router;