def get_ints
  gets.chomp.split.map(&:to_i)
end

def gather_warriors(count, hash)
  count.times do
    power, level = get_ints
    (hash[level] ||= []) << power
  end
end

test_cases_count = gets.chomp.to_i
test_cases = []

test_cases_count.times do
  soints = {}
  sofloats = {}
  soints_count, sofloats_count = get_ints

  gather_warriors(soints_count, soints)
  gather_warriors(sofloats_count, sofloats)

  test_cases << [soints, sofloats]
end

def run_test(soints, sofloats)
  needed_chakra = 0

  soints.keys.each do |level|
    soints_summed_power = soints[level].inject(&:+)
    sofloats_summed_power = sofloats[level].inject(&:+)

    needed_chakra += [0, sofloats_summed_power - soints_summed_power].max
  end

  puts needed_chakra
end

test_cases.each do |test_case|
  run_test(test_case.first, test_case.last)
end
