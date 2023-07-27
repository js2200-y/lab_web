/**
 *  event.js
 */

 
 document.addEventListener('DOMContentLoaded', function() {
    
    const itemInput = document.querySelector('input#itemInput');
    const btnInput = document.querySelector('button#btnInput');
    const itemList = document.querySelector('ul#itemList');
    const itemInput2 = document.querySelector('input#itemInput2');
    const itemList2 = document.querySelector('ul#itemList2');
    const username = document.querySelector('input#username');
    const age = document.querySelector('input#age');
    
    btnInput.addEventListener('click', function() {
        //console.log(arguments); 
        
       // input에 입력된 값을 읽음.
       const value = itemInput.value;
       //console.log(value);
       
       // input에 입력된 값으로 li요소를 만듬.
       const item = `<li>${value}</li>`;
       
       // li 요소를 ul에 추가.
       itemList.innerHTML += item;
       
       // input의 값을 지우기.
       itemInput.value = ''; // 비어있는 문자열로 재할당~!
       
       // input에 포커스를 줌.
       itemInput.focus();
       
       
    });
     
     itemInput2.addEventListener('keydown', function(e) {
       // console.log(e); // -> e:keyboardEvent 객체
        // 모든 이벤트 핸들러 함수(콜백)은 이벤트 객체를 argument로 전달 받음.
       if (e.key === 'Enter') {
       const item = `<li>${itemInput2.value}</li>`;
       itemList2.innerHTML += item;
       itemInput2.value = '';
       itemInput2.focus();
     }
     });   
     
     username.addEventListener('change', function(e) {
       updateNameAndAge();
     });
     age.addEventListener('change', function(e) {
         updateNameAndAge();
     });
     
     function updateNameAndAge(){
        const name = username.value;
        const age2 = age.value;
        const text = `<b>이름:</b> ${name}, <b>나이:</b> ${age2}`;
        result.innerHTML = text;
     }
     
    });
    
    
