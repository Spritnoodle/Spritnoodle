Ext.define('message.model.MessageModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.messageModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'message',
		type : 'string',
		sortable : true
	}, {
		name : 'date',
		type : 'string',
		sortable : true
	}, {
		name : 'author',
		type : 'string',
		sortable : true
	}, {
		name : 'commenter',
		type : 'string',
		sortable : true
	}, {
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