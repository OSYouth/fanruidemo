/**
 * Created by lc on 2017/11/18.
 */
$(function(){
    $("#addBtn").click(function(){
        window.location.href="/project/add";
    });
})

function viewDetail(id){
    window.location.href="/project/viewDetail/id=" + id;
}