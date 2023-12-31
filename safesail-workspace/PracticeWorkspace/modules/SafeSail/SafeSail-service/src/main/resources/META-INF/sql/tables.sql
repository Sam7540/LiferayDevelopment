create table Safe_Sail_Form1 (
	uuid_ VARCHAR(75) null,
	sailId LONG not null,
	quoteId VARCHAR(75) not null,
	fullname VARCHAR(75) null,
	dob DATE null,
	gender VARCHAR(75) null,
	phoneNo LONG,
	emailAddress VARCHAR(75) null,
	panNumber VARCHAR(75) null,
	annualIncome LONG,
	sumAssured LONG,
	policyTerm INTEGER,
	PPTerm INTEGER,
	paymentFrequency VARCHAR(75) null,
	PayoutOption VARCHAR(75) null,
	lifeSecure INTEGER,
	lifePlus INTEGER,
	CIPBenefit INTEGER,
	totalValues LONG,
	totalAddon LONG,
	agreement BOOLEAN,
	primary key (sailId, quoteId)
);