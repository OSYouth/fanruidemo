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
 * @Describe 输入完 文本设计费 以后 院挂账设计费 同步输出相同数字，并且有检测是不是数字的功能
 * @param String
 */
function checkTextDesignFee(String) {
    // debugger;
    var data = document.getElementById(String).value;
    $("#hangUpDesignFee").val(data);
    checkIsNumber(String);
}

function checkApprovedDesignFee(String) {
    // debugger;
    var approvedDesignFee = document.getElementById(String).value;
    var hangUpDesignFee = document.getElementById("hangUpDesignFee").value;
    $("#differenceAmount").val((hangUpDesignFee-approvedDesignFee).toFixed(2));
    checkIsNumber(String);
}

function checkHangUpRation(String) {
    var hangUpRation = document.getElementById(String).value;
    var approvedDesignFee = document.getElementById("hangUpDesignFee").value;
    var result = (hangUpRation/100)*approvedDesignFee;
    $("#projectSubtotal").val(result.toFixed(2));
    $("#paymentAmount").val(result.toFixed(2));
    $("#actualReceiveAmount").val(result.toFixed(2));
    checkIsNumber(String);
}

function checkLandTax(String) {
    var projectSubtotal = document.getElementById("projectSubtotal").value;
    var manageFee = document.getElementById("manageFee").value;
    var landTax = document.getElementById(String).value;
    var result = ((100-landTax-manageFee)/100)*projectSubtotal;
    $("#hangUpSubtotal").val(result.toFixed(2));
    $("#cooperationPaymentAmount").val(result.toFixed(2));
    $("#reachMoneyAmount").val(result.toFixed(2));
    checkIsNumber(String);
}
