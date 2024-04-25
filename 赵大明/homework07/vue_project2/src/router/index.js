import Vue from "vue";
import VueRouter from "vue-router";
import User from "@/views/User";
import NotFound from "@/views/NotFound";

Vue.use(VueRouter)

const routes = [
    {
        path: "/user",
        component: User
    },
    {
        path:"/user",
        component: User
    },
    {
        path: "*",
        component: NotFound
    }
]

const router = new VueRouter({
    routes: routes
});

export default router;