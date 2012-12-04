require 'set'

num_tests = gets.to_i
(1..num_tests).each do 
  values = gets.to_i
  s1 = SortedSet.new
  line = gets.split(" ")
  (0..values-1).each do |i|
    s1 << line[i].to_i
  end
  arr = s1.to_a
  min_diff = arr[1] - arr[0]
  target = values - 2 > 1 ? values - 2 : 1
  (1..target).each do |i|  
    min_diff = arr[i+1] - arr[i] if min_diff > arr[i+1] - arr[i]
  end
  puts min_diff
end
