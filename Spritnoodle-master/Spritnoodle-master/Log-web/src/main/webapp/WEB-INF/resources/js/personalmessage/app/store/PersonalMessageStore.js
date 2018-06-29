var pageSize = 20;

Ext.define('personalmessage.store.PersonalMessageStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.personalmessageStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'personalmessage.model.PersonalMessageModel',
	proxy : {
		url : server_context + '/personalmessage/personalmessage/.json',
		type : 'ajax',
		api : {
			read : server_context + '/personalmessage/personalmessage/.json',
			update : server_context + '/personalmessage/personalmessage/.json'
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