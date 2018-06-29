Ext.define('personalmessage.model.PersonalMessageModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.personalmessageModel',
	fields : [ {
		name : 'id',
		type : 'int',
		sortable : true
	}, {
		name : 'personalmessage',
		type : 'string',
		sortable : true
	}, {
		name : 'grade',
		type : 'string',
		sortable : true
	}, {
		name : 'name',
		type : 'string',
		sortable : true
	}, {
		name : 'cno',
		type : 'string',
		sortable : true
	}, {
		name : 'task',
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
	}]
});