/*function imageChoose(obj) {
    let f = obj.files[0];

    if (!f.type.match("image.*")) {
        alert("이미지를 등록해야 합니다.");
        return;
    }

    let reader = new FileReader();
    reader.onload = (e) => {
        $("#imageUploadPreview").attr("src", e.target.result);
    }
    reader.readAsDataURL(f); // 이 코드 실행시 reader.onload 실행됨.
}*/

function profileImageUpload(principalId, obj) {
    let f = obj.files[0];

    if (!f.type.match("image.*")) {
        alert("이미지를 등록해야 합니다.");
        return;
    }

    console.log(principalId);
    let profileImageForm = $("#userProfileForm")[0];
    console.log(profileImageForm);
    let formData = new FormData(profileImageForm);
    $.ajax({
        type: "put",
        url: `/api/user/${principalId}/profileImageUrl`,
        data: formData,
        contentType: false,
        processData: false,
        enctype: "multipart/form-data",
        dataType: "json"
    }).done(res =>{
        // 사진 전송 성공시 이미지 변경
        let reader = new FileReader();
        reader.onload = (e) => {
            $("#userProfileImage").attr("src", e.target.result);
        }
        reader.readAsDataURL(f); // 이 코드 실행시 reader.onload 실행됨.
    }).fail(error => {
        console.log("오류", error);
    });

}