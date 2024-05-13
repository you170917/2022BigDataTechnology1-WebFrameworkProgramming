import Vue from 'vue'
import App from './App.vue'
import router from "@/router" ;
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
Vue.use(ElementUI)


import {deleteRequest, getRequest, postRequest, putRequest} from "@/utils/api";
// 通过 Vue.prototype 注册全局变量,通过 this.getRequest 就可以调用该方法
Vue.prototype.getRequest = getRequest;
Vue.prototype.postRequest = postRequest;
Vue.prototype.putRequest = putRequest;
Vue.prototype.deleteRequest = deleteRequest;

// 这样就可以在任一 Vue 组件中
// 通过 this.getRequest 调用对应的 get 请求；
// 通过 this.postRequest 调用对应的 post 请求；
// 通过 this.putRequest 调用对应的 put 请求；
// 通过 this.deleteRequest 调用对应的 delete 请求。

Vue.config.productionTip = false

new Vue ({
  render: h => h(App),
  router,
}).$mount('#app')

// 在路由模块的最后，使用了 export default router 导出此模块，其他模块就可以使用 router 模块，
// 我们需要在 main.js 里面，将 router 注入到 Vue 实例中


