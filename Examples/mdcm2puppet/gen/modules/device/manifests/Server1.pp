class device::Server1 {
	include device::Server1::mydbPG
	include device::Server1::Tomcat7
	include device::Server1::mydbMySQL
	include device::Server1::Apache
}
