class device::Server2 {
	include device::Server2::Java
	include device::Server2::Firewall
	include device::Server2::mydb
	include device::Server2::RedHat
}
