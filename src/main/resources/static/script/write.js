function cancle() {
    var con = confirm("登録をキャンセルしますか？\nキャンセルすると作成した内容は消えます。")

    if (con == true) {
        history.back();
    }
}

function write_send() {
    if (write_frm.agendaName.value == '') {
        alert("案件名を入力してください。")
        write_frm.agendaName.focus()
        return
    }else if (write_frm.agendaStartDate.value == '') {
        alert("契約期間を入力してください。")
        write_frm.agendaStartDate.focus()
        return
    }else if (write_frm.agendaEndDate.value == '') {
        alert("契約期間を入力してください。")
        write_frm.agendaEndDate.focus()
        return
    }
    else if (write_frm.agendaPlace.value == '') {
        alert("勤務地を入力してください。")
        write_frm.agendaPlace.focus()
        return
    }else if (write_frm.agendaMinPay.value == '') {
        alert("月額単位を入力してください。")
        write_frm.agendaMinPay.focus()
        return
    }else if (write_frm.agendaMaxPay.value == '') {
        alert("月額単位を入力してください。")
        write_frm.agendaMaxPay.focus()
        return
    }
    else if (write_frm.agendaCategory.value == '') {
        alert("カテゴリーを入力してください。")
        write_frm.agendaCategory.focus()
        return
    }else if (write_frm.agendaSkill.value == '') {
        alert("必要スキルを入力してください。")
        write_frm.agendaSkill.focus()
        return
    }else if (write_frm.agendaInterviewNumber.value == '') {
        alert("面談回数を入力してください。")
        write_frm.agendaInterviewNumber.focus()
        return
    }else if (write_frm.agendaEtc.value == '') {
        alert("その他のところを入力してください。")
        write_frm.agendaEtc.focus()
        return
    }

    write_frm.submit();
}