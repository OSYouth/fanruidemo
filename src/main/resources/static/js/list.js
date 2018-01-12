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
})

function viewDetail(id){
    window.location.href="/project/viewDetail/id=" + id;
}
function updateProject(id){
    window.location.href="/project/viewDetail/id=" + id;
}
function deleteProjet(id){
    window.location.href="/project/viewDetail/id=" + id;
}