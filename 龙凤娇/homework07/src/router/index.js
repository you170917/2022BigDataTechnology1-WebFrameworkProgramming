import Vue from "vue";
import VueRouter from "vue-router";
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue";

Vue.use(VueRouter);
const  routes = [
 {
  path: "/",
  redirect:"/user"
 },
 {
  path: "*",
  component: NotFound
 },
 {
  path: "/user",
  component: User
 }
]

const router = new VueRouter({
 routes:routes
});
 export default router;