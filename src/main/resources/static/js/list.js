/**
 * Created by lc on 2017/11/18.
 */
$(function(){
    $("#addBtn").click(function(){
        window.location.href="/project/add";
    });
    $("#returnHomeBtn").click(function(){
        window.location.href="/home";
    });
    // $("#deleteProjectBtn").click(function () {
    //     window.location.href="/project/list";
    // })
})

function viewDetail(id){
    window.location.href="/project/viewDetail/id=" + id;
}
function updateProject(id){
    window.location.href="/project/updateProject/id=" + id;
}
function deleteProject(id){
    // window.location.href="/project/deleteProject/id=" + id;
    $.ajax({
        type: 'DELETE',
        url: "/project/deleteProject/id="+id,
        // data: {"id":id},
        success: function(data){
            // debugger;
            if ('success' == data){
                alert("删除成功");
                window.location.href="/project/list";
            } else {
                alert('删除失败');
            }
        }
    });
}