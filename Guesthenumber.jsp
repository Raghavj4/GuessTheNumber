<style type="text/css">
@import url('https://fonts.googleapis.com/css2?family=Josefin+Sans:ital,wght@1,500&family=Nova+Square&family=Roboto+Condensed:wght@300&family=Roboto:wght@100&display=swap');
body{
background:url(lollipop-g2fe91e9cd_640.jpg);
font-family: 'josefin-Sans', sans-serif;
}

.container{
position:absolute;
background:black;
top:50%;
left:50%;
transform:translate(-50%,-50%);
padding:50px;
height:300px;
}
#userguess{
background:transparent;
border:none;
outline:none;
border-bottom:2px solid yellow;
letter-spacing:3px;
color:#fff;
}
#gbtn{
border:none;
outline:none;
background:cyan;
color:#333;
border-radius:5px;
padding:5px;
}
#btn2{
border:none;
outline:none;
background:cyan;
color:#333;
border-radius:5px;
padding:5px;
}
.container h3,.container label{
color:white;
}
</style>
</head>
<body>
<div class = "container">
<input type = "text" id = 'userguess'placeholder = "Enter the number">
<button id = "gbtn">Guess</button>
<h3 id = "checker"></h3>
<label id = "history">Your guesses:</label>
</div>
<script>
var guess = document.getElementById("userguess");
var btn = document.getElementById("gbtn");
var msg = document.getElementById("checker");
var hist = document.getElementById("history");
var number = Math.floor(Math.random()*100);
console.log(number);
let reload = ()=>{
	location.reload();
}
btn.addEventListener('click',()=>{
	if(guess.value<number){
		msg.innerHTML = "Your guess is low";
	}
	else if(guess.value>number){
		msg.innerHTML = "Your guess is high";
	}
	if(guess.value==number){
		msg.innerHTML = "Your guess is correct Congratulations!<button id = 'btn2' onclick = 'reload()'>play again!</button>";
	}
	hist.innerHTML += guess.value+", ";
})
</script>
