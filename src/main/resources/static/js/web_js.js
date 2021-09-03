$(function(){

	//导航
	$('.nav_kg').click(function(){
		$('.nav').fadeToggle();	
	});
	
	//加入我们
	$('.hr_lb ul li .hr_lb2').click(function(){
		$(this).parent().addClass('hover').siblings().removeClass('hover');	
		$('.hr_lb3').slideUp();
		$(this).siblings('.hr_lb3').slideDown();
	});
	
	//专卖店
	$('.sto_map li a').hover(function(){
		$(this).siblings('.sto_name').show();	
	},function(){
		$(this).siblings('.sto_name').hide();	
	});
	
	//在线申请
	$('.clse_a').click(function(){
		$('.tk1').fadeToggle();	
	});
	
	//产吕列表
	
	$('.pro_list li').hover(function(){
		$(this).find('.p_title').fadeIn(600);	
	},function(){
		$(this).find('.p_title').fadeOut(300);		
	});
	
	
	
})

//选项卡
function setTab(name,cursel,n){
for(i=1;i<=n;i++){
var menu=document.getElementById(name+i);
var con=document.getElementById("con_"+name+"_"+i);
menu.className=i==cursel?"hover":"";
con.style.display=i==cursel?"block":"none";
}
}