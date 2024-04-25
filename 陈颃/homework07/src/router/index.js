
import VueRouter from "vue-router";
import User from "@/views/User.vue";



const routes = [
    {
        path: "/user",
        component: User
    }
]
const router  =new VueRouter({
    routes: routes
});
export default router;