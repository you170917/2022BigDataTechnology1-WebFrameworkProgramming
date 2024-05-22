import axios from "axios";

export class Users{
    urls = {
        login:"/api/users/login"
    }
    Login(username,password){
        axios.post(this.urls.login,{
            username:username,
            password:password
        }).then(res=>{
            if (res.status === 200){
                alert("登录成功")
            }else if (res.status === 201){
                alert("密码错误")
            }else if (res.status === 202){
                alert("用户不存在")
            }
        })
    }
}