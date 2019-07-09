class configurations::java::S2jdk8 {
	java::oracle { 'S2jdk8',
		version_major => '8u101',
		version_minor => 'b13',
		java_se => 'jdk',
		
	}
}
