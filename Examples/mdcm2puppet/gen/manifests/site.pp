#!/usr/bin/puppet
# -*- puppet -*-
# File managed by mdcms

node /^PCUnix2\./ {
	include device::PCUnix2
}
node /^PCWin2\./ {
	include device::PCWin2
}
node /^Server3\./ {
	include device::Server3
}
node /^PCUnix1\./ {
	include device::PCUnix1
}
node /^SwitchUnix\./ {
	include device::SwitchUnix
}
node /^RouterPC\./ {
	include device::RouterPC
}
node /^SwitchWin\./ {
	include device::SwitchWin
}
node /^RouterServers\./ {
	include device::RouterServers
}
node /^SwitchServers\./ {
	include device::SwitchServers
}
node /^PCWin1\./ {
	include device::PCWin1
}
node /^Server1\./ {
	include device::Server1
}
node /^Server2\./ {
	include device::Server2
}
node /^Printer\./ {
	include device::Printer
}
