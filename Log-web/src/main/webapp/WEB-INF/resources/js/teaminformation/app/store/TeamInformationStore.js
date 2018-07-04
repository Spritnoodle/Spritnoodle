var pageSize = 20;

Ext.define('teaminformation.store.TeamInformationStore', {
	extend : 'Ext.data.Store',
	alias : 'widget.teaminformationStore',
	autoLoad : true,
	autoSync : true,// 需要同步
	model : 'teaminformation.model.TeamInformationModel',
	proxy : {
		url : server_context + '/teaminformation/teaminformation/.json',
		type : 'ajax',
		api : {
			read : server_context + '/teaminformation/teaminformation/.json',
			update : server_context + '/teaminformation/teaminformation/.json'
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