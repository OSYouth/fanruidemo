/**
 * Created by lc on 2017/12/3.
 */
$(function(){
    $("#saveBtn").click(function () {
        $.post("/admin/saveUser",$("#userForm").serialize(),function (data){
            if(data.code==0){
                window.location.href="/admin";
            }else{
                alert("保存失败！");
            }
        });
    })
})