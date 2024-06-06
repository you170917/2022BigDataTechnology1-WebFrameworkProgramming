import axios from "axios";
let baseUrl = "http://localhost:8081";
// 封装 GET 请求
methods: {
    submitLogin() {
        this.$refs.loginForm.validate((valid) =>{
            if (valid){
                this.postKeyValueRequest("/login", this.loginData).then(resp=>{
                    if (resp){
                        window.sessionStorage.setItem("account",
                            JSON.stringify(resp.obj));
                        this.$router.replace("/home");
                        this.$message.success("登录成功!")
                    }
                })
            }
            else {
                this.$message.error('请输入所有字段');
                return false;
            }
        })
    }
}

export const getRequest = (url, params) => {
    return axios({
        method: "get",
        url: `${baseUrl}${url}`,
        data: params
    })
}
// 封装 POST 请求
export const postRequest = (url, params) => {
    return axios({
        method: "post",
        url: `${baseUrl}${url}`,
        data: params
    })
}
// 封装 PUT 请求
export const putRequest = (url, params) => {
    return axios({
        method: "put",
        url: `${baseUrl}${url}`,
        data: params
    })
}
// 封装 DELETE 请求
// 该请求接收查询参数,这里需要使用 params 参数
export const deleteRequest = (url, params) =>{
    return axios({
        method: "delete",
        url: `${baseUrl}${url}`,
        params: params, //该请求接收查询参数,这里需要使用 params 参数
    })
}
export const postKeyValueRequest=(url, params) =>{
    return axios({
        method: "post",
        url: `${baseUrl}${url}`,
        data: params,
        transformRequest: [function (data) {
            let ret = '';
            for (let i in data){
                ret += encodeURIComponent(i)+"="+ encodeURIComponent(data[i]) +
                    "&";
            }
            return ret;
        }],
        header: {
            "Content-Type": "application/x-www-urlencoded"
        }
    })
}