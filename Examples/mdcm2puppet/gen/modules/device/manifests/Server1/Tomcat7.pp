class device::Server1::Tomcat7 {
	tomcat::install { '/opt/tomcat':
		source_url => 'https://www-us.apache.org/dist/tomcat/tomcat-7/v7.0.x/bin/apache-tomcat-7.0.x.tar.gz',
		
	}
	include configurations::tomcat::S1Tomcat7
}
