//package cn.it.shop.action;
//
//import java.util.List;
//
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Controller;
//
//import cn.it.shop.model.Admin;
//
//@Controller
//@Scope("prototype")
//public class AdminAction extends BaseAction<Admin>{
//
//	$(function users(){
//			var a=null;
//			//���ݱ��
//			$('#usersdg').datagrid({
//			    url:'getallgood.action?gname='+a,
//			   	pagination:true,
//			   	rownumbers:true,
//			   	striped:true,
//			   	singleSelect:true, 			    
//			    columns:[[
//					{field:'RoleName',title:'�˺�',width:300,align:'center'},
//					{field:'RoleDesc',title:'����',width:300,align:'center'}
//			    ]],
//			 //���ݱ��  
//			   toolbar: [{
//				  	text:'��ɫ',
//				iconCls: 'icon-customer2',
//				handler: $('#usersdg').hide()
//				  	
//				},'-',{
//					text:'�û�',
//					iconCls: 'icon-users',
//					handler: $('#roledg').hide()
//				}]
//
//			});
//		});
//				
//		
//		$(function detail(){
//			var a=null;
//			//���ݱ��
//			$('#privilegedg').datagrid({
//			    url:'getallgood.action?gname='+a,
//			   	pagination:true,
//			   	rownumbers:true,
//			   	striped:true,
//			   	singleSelect:true, 			    
//			    columns:[[
//					{field:'distribution',title:'����Ȩ��',width:80,align:'center'},
//					{field:'forbid',title:'��ֹȨ��',width:80,align:'center'},
//					{field:'menuBtn',title:'�˵�-��ť',width:300,align:'center'},
//					{field:'code',title:'����',width:300,align:'center'},
//					{field:'MenuIcon',title:'ͼ��',width:300,align:'center'}
//			    ]],
//
//			});
//		});
//}
