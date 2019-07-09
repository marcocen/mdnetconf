class configuration::tomcat::S1Tomcat7{
	tomcat::instance { 'S1Tomcat7'
		catalina_home => '/opt/tomcat9',
		catalina_base => '/opt/tomcat9/first',
		port => '8081',
		additional_attributes => { 'redirectPort' => '8443' },
	}
}
