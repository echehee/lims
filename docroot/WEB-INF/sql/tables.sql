create table lims_AccountItem (
	accountItemId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	parentName VARCHAR(75) null,
	itemCode LONG
);

create table lims_Budget (
	budgetId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	projectName VARCHAR(75) null,
	budgetName VARCHAR(75) null,
	budgetStartYear INTEGER,
	budgetEndYear INTEGER,
	budgetTotal DOUBLE,
	budgetArrival DOUBLE
);

create table lims_BudgetApplication (
	budgetApplicationId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	applicantId LONG,
	applicantName VARCHAR(75) null,
	auditorId LONG,
	auditorName VARCHAR(75) null,
	auditDate DATE null,
	approverId LONG,
	approverName VARCHAR(75) null,
	approveDate DATE null,
	finisherId LONG,
	finisherName VARCHAR(75) null,
	finisherDate DATE null,
	rejectReason VARCHAR(75) null,
	applicationStatus VARCHAR(75) null,
	applicationDescription VARCHAR(75) null,
	applicationTotal DOUBLE,
	projectName VARCHAR(75) null,
	budgetName VARCHAR(75) null,
	budgetItemId LONG
);

create table lims_BudgetArrival (
	budgetArrivalId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	operatorId LONG,
	operatorName VARCHAR(75) null,
	arrivalTotal DOUBLE,
	projectName VARCHAR(75) null,
	budgetName VARCHAR(75) null
);

create table lims_BudgetItem (
	budgetItemId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	budgetId LONG,
	accountItemId LONG,
	accountItemName VARCHAR(75) null,
	itemCode LONG,
	budgetTotal DOUBLE,
	budgetUsed DOUBLE
);

create table lims_Project (
	projectId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	projectName VARCHAR(75) null,
	projectLeader VARCHAR(75) null,
	projectStatus VARCHAR(75) null
);