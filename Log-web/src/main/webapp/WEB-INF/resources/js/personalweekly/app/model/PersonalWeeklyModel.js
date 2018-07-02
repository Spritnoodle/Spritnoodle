Ext.define('personalweekly.model.PersonalWeeklyModel', {
	extend : 'Ext.data.Model',
	alias : 'widget.personalweeklyModel',
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
		name : 'uname',
		type : 'string',
		sortable : true
	}, {
		name : 'uid',
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