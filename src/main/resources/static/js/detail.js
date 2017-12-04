/**
 * Created by lc on 2017/11/30.
 */
$(function(){
    $("#addHangUpBtn").click(function () {
        $.post("/project/saveHangUp",$("#hungUpForm").serialize(),function (data){
            if(data.code==0){
                window.location.href="/project/viewDetail/id="+data.data.idTemp;
            }else{
                alert("保存失败！");
            }
        });
    })
    $("#addCompanyAccountBtn").click(function () {
        $.post("/project/saveCompanyAccount",$("#companyAccountForm").serialize(),function (data){
            if(data.code==0){
                window.location.href="/project/viewDetail/id="+data.data.idTemp;
            }else{
                alert("保存失败！");
            }
        });
    })
    $("#returnBtn").click(function () {
        window.location.href="/project/list";
    })
})