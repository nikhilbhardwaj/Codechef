def calculate_area(line)
  x1,y1, x2,y2, x3,y3 = line.split.map(&:to_i)
  a = Math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)
  b = Math.sqrt((x3 - x2) ** 2 + (y3 - y2) ** 2)
  c = Math.sqrt((x3 - x1) ** 2 + (y3 - y1) ** 2)

  s = (a + b + c) / 2
  Math.sqrt(s * (s - a) * (s - b) * (s - c))
end

num_triangles = gets.to_i
areas = []

num_triangles.times do 
  areas << calculate_area(gets)
end

min_index = max_index = 0
min_area = max_area = areas.first

(0..areas.length - 1).each do |index|
  if areas[index] <= min_area 
    min_index = index
    min_area = areas[min_index]
  end

  if areas[index] >= max_area
    max_index = index
    max_area = areas[max_index]
  end
end

puts "#{min_index + 1} #{max_index + 1}"