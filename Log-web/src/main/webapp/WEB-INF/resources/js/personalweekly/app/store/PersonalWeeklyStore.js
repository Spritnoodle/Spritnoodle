var pageSize = 20;

Ext.define('personalweekly.store.PersonalWeeklyStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.personalweeklyStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'personalweekly.model.PersonalWeeklyModel',
	proxy : {
		url : server_context + '/personalweekly/personalweekly/.json',
		type : 'ajax',
		api : {
			read : server_context + '/personalweekly/personalweekly/.json',
			update : server_context + '/personalweekly/personalweekly/.json'
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