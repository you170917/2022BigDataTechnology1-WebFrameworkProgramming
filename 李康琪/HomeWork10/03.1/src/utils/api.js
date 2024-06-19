import axios from "axios";
axios.defaults.withCredentials = true;
let baseurl = "http://localhost:8082";
//GET
export const getRequest = (url,params) => {
    return axios({
        method: "get",
        url: `${baseurl}${url}`,
        data: params
    })
}

//POST
export const postRequest = (url, params) => {
    return axios({
        method: "post",
        url: `${baseurl}${url}`,
        data: params
    })
}
//PUT
export const putRequest = (url, params) => {
    return axios({
        method: "put",
        url: `${baseurl}${url}`,
        data: params
    })
}
//DELETE
export const deleteRequest = (url, params) => {
    return axios({
        method: "delete",
        url: `${baseurl}${url}`,
        params: params, //该请求接收查询参数,这里需要使用 params 参数
    })
}

export const postKeyValueRequest=(url, params) =>{
    return axios({
        method: "post",
        url: `${baseurl}${url}`,
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

