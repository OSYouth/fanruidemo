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
        $.post("/project/saveCompanyAccount"+data.data.id,$("#companyAccountForm").serialize(),function (data){
            if(data.code==0){
                window.location.href="/project/viewDetail/id="+data.data.idTemp;
            }else{
                alert("保存失败！");
            }
        });
    })
    $("#deleteHangUpBtn").click(function () {
        $.post("/project/deleteHangUp/id=" + id,function (data){
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
// function deleteHangUp(id){
//     window.location.href="/project/deleteHangUp/id=" + id;
// }
/**
 * @Describe 设计用来放到提交环节，如果返回值不为真就提交不了
 * @returns {checkIsNumber|checkIsLessThanFive}
 */
// function checkResult() {
//     var checkResult = checkIsNumber && checkIsLessThanFive;
//     return checkResult;
// }

/**
 * @Describe 检查输入是不是数字，不是数字的时候动态提示输入有误
 * @param String
 * @returns {boolean}
 */
function checkIsNumber(String) {
    var isNumberCheck = false;
    var number = document.getElementById(String).value;
    var d = /^(-?\d+)(\.\d+)?$/;
    if (!d.test(number)) {
        document.getElementById(String +"Msg").innerHTML = "输入有误，请输入数字";
        isNumberCheck = false;
    } else {
        document.getElementById(String + "Msg").innerHTML = "";
        isNumberCheck = true;
    }
    return isNumberCheck;
}

/**
 * @Describe 检测输入的数字是否小于5，不满足条件时提示错误信息
 * @param String
 * @returns {boolean}
 */
function checkIsLessThanFive(String) {

    var checkIsLessThanFive = false;
    var times = document.getElementById(String).value;
    var d = /^\+?[1-9][0-9]*$/;
    if (times>5 || !d.test(times)) {
        document.getElementById(String +"Msg").innerHTML = "输入应为数字，且次数应小于5，请重新输入";
        checkIsLessThanFive = false;
    } else {
        document.getElementById(String +"Msg").innerHTML = "";
        checkIsLessThanFive = true;
    }
    return checkIsLessThanFive;
}

/**
 * @Describe 输入完以后发票金额同步到一个数字，并且有检测是不是数字的功能
 * @param String
 */
function checkActualHangUpAmount(String) {
    // debugger;
    var data = document.getElementById(String).value;
    // $("#hangUpInvoiceAmount").val(data);
    document.getElementById("hangUpInvoiceAmount").value=data;
    checkIsNumber(String);
}
