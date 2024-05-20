import Vue from 'vue'
import App from './App.vue'
import router from "@/router";
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import {postKeyValueRequest} from "@/utils/api";
import {deleteRequest, getRequest, postRequest, putRequest} from "@/utils/api";
import axios from "axios";

Vue.use(ElementUI);
Vue.config.productionTip = false


new Vue({
  render: h => h(App),
  router,
}).$mount('#app')

Vue.prototype.getRequest = getRequest;
Vue.prototype.postRequest = postRequest;
Vue.prototype.putRequest = putRequest;
Vue.prototype.deleteRequest = deleteRequest;
Vue.prototype.postKeyValueRequest = postKeyValueRequest;
