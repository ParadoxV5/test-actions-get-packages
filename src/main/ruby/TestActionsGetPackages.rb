require 'mygem'
if /\A\d+(\.\d+)+\Z/.match?(MyGem::VERSION)
  puts('simple test passed')
else
  raise('simple test failed')
end