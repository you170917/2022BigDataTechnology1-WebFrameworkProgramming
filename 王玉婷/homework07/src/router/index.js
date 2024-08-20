import VueRouter from "vue-router";
import Vue from "vue";
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue";
import Home from "@/views/home.vue";

Vue.use(VueRouter);

const routes = [
    {
      path:"/",
        component: Home
    },
    {
        path:"/user",
        component:User
    },
    {
        path: "*",
        component: NotFound
    }
]

const router = new VueRouter({
    routes:routes
});
export default router;