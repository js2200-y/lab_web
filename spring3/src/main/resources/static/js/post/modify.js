/**
 * 포스트 업데이트/삭제 기능
 */
document.addEventListener('DOMContentLoaded', () => {
    
    // 1. <form> 요소를 찾기
    const postModifyForm = document.querySelector('#postModifyForm');
    
    
    const btnUpdate = document.querySelector('#btnUpdate');
    btnUpdate.addEventListener('click', (e) => {
        const title = document.querySelector('#title').value; // input의 값을 찾음.# 을 붙여야 id를 찾을 수 있음!!
        const content = document.querySelector('#content').value; // textarea도 value로 값을 찾음.
        if (title === '' || content ===''){
            alert('제목과 내용은 반드시 입력하세요..');
            return;
        }
        
        const result = confirm('변경된 내용을 업데이트할까요?')
        if (!result){
            return;
        }
        
        postModifyForm.action = '/post/update';
        postModifyForm.method = 'post';
        postModifyForm.submit();
        
    });
    
    const btnDelete = document.querySelector('#btnDelete');
    btnDelete.addEventListener('click', (e) => {
        const result = confirm('정말 삭제할까요?');
        if (!result) {
            return;
        }
        
        postModifyForm.action = '/post/delete'; // submit 요청주소
        postModifyForm.method = 'post'; // submit 요청방식
        postModifyForm.submit(); // 폼 제출(submit), 요청 보내기.
        
    });
    
});