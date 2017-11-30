/**
 * Created by lc on 2017/11/18.
 */
$(function(){
    $("#saveBtn").click(function () {
        $.post("/project/saveProject",$("#projectForm").serialize(),function (data){
            if(data.code==0){
                window.location.href="/project/viewDetail/id="+data.data.id;
            }else{
                alert("保存失败！");
            }
        });
    })
    $("#returnBtn").click(function () {
        window.location.href="/project/list";
    })
})