class device::Server2::Java {
	class { 'java':
		package => 'java-1.8.0-openjdk-devel',
		distribution => 'jdk',
		
	}
	
	include configurations::java::S2jdk8
}
