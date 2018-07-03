var pageSize = 20;

Ext.define('chatmessage.store.ChatMessageStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.chatmessageStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'chatmessage.model.ChatMessageModel',
	proxy : {
		url : server_context + '/chatmessage/chatmessage/.json',
		type : 'ajax',
		api : {
			read : server_context + '/chatmessage/chatmessage/.json',
			update : server_context + '/chatmessage/chatmessage/.json'
		},
		reader : {
			type : 'json',
			root : 'content',
			totalProperty : 'totalElements'
		},
		writer : {
			type : 'json'
		}
	},
	// 每页显示的记录行数
	pageSize : pageSize
});