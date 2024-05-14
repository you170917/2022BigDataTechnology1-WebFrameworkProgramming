import axios from "axios";
axios.defaults.withCredentials = true;
let baseUrl = "http://localhost:8082";
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

export const getRequest = (url, params) => {
    return axios({
        method: "get",
        url: `${baseUrl}${url}`,
        data: params
    })
}

export const postRequest = (url, params) => {
    return axios({
        method: "post",
        url: `${baseUrl}${url}`,
        data: params
    })
}

export const putRequest = (url, params) => {
    return axios({
        method: "put",
        url: `${baseUrl}${url}`,
        data: params
    })
}

export const deleteRequest = (url, params) =>{
    return axios({
        method: "delete",
        url: `${baseUrl}${url}`,
        params: params,
    })
}
