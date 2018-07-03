Ext.define('chatmessage.model.ChatMessageModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.chatmessageModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'chatmessage',
		type : 'string',
		sortable : true
	}, {
		name : 'date',
		type : 'string',
		sortable : true
	}, {
		name : 'spokesman',
		type : 'string',
		sortable : true
	},  {
		name : 'dateCreated',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	}, {
		name : 'dateModified',
		type : 'date',
		dateFormat : 'time',
		sortable : true
	} ]
});